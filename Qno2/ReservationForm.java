public class ReservationForm {
    // Dummy field placeholders for example
    private String reserverName, address, creditCardNo, guesthouseName, roomType, multiLineAddress;
    private Object existingAddresses;
    private java.util.Date startDate, endDate;

    private TextField reservationFeedbackField = new TextField();
    private TextField customerNameField = new TextField();
    private TextField creditCardNumberField = new TextField();
    private TextArea customerAddressTextArea = new TextArea();

    public void confirmReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (!areDatesValid()) return;
        if (!isNameValid()) return;
        if (!isAddressValid()) return;
        if (!isCreditCardValid()) return;

        String reservationMessage = GuesthouseChainFacade.makeReservation(
            guesthouseName, startDate, endDate, roomType,
            reserverName, multiLineAddress, creditCardNo
        );

        reservationFeedbackField.setText(reservationMessage);

        if (reservationMessage.startsWith("Confirmed")) {
            setEnabledMakeReservationPanel(false);
        }
    }

    private boolean areDatesValid() {
        if (startDate == null || endDate == null) {
            reservationFeedbackField.setText("Enter valid dates");
            return false;
        }
        return true;
    }

    private boolean isNameValid() {
        if (reserverName == null || reserverName.trim().isEmpty()) {
            reservationFeedbackField.setText("Enter valid name");
            customerNameField.requestFocus();
            return false;
        }
        return true;
    }

    private boolean isAddressValid() {
        if (address == null || address.trim().isEmpty()) {
            reservationFeedbackField.setText("Enter valid address");
            customerAddressTextArea.requestFocus();
            return false;
        }
        return true;
    }

    private boolean isCreditCardValid() {
        if (existingAddresses == null &&
            !GuesthouseFacade.isValidCreditCardNumberFormat(creditCardNo)) {
            reservationFeedbackField.setText(
                GuesthouseFacade.creditCardNumberFormatError(creditCardNo));
            creditCardNumberField.selectAll();
            creditCardNumberField.requestFocus();
            return false;
        }
        return true;
    }

    private void setEnabledMakeReservationPanel(boolean enabled) {
        // Stub
    }
}

// Dummy UI components for compilation only
class TextField {
    public void setText(String s) {}
    public void requestFocus() {}
    public void selectAll() {}
}

class TextArea {
    public void requestFocus() {}
}

class GuesthouseChainFacade {
    public static String makeReservation(String guesthouseName, java.util.Date startDate, java.util.Date endDate,
                                         String roomType, String reserverName, String multiLineAddress, String creditCardNo) {
        return "Confirmed: Reservation made.";
    }
}

class GuesthouseFacade {
    public static boolean isValidCreditCardNumberFormat(String creditCardNo) {
        return creditCardNo != null && creditCardNo.replace(" ", "").matches("\\d{16}");
    }

    public static String creditCardNumberFormatError(String creditCardNo) {
        return "Invalid credit card number format.";
    }
}