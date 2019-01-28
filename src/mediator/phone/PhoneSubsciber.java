package mediator.phone;

public class PhoneSubsciber {
    private PhoneOperatorMediator phoneOperator;
    private long phoneNumber;
    public PhoneSubsciber(PhoneOperatorMediator phoneOperator) {
        this.phoneOperator = phoneOperator;
        this.phoneNumber = phoneOperator.generatePhoneNumber();
    }
    public boolean call(PhoneSubsciber otherPhoneSubsciber) {
        return phoneOperator.connect(this, otherPhoneSubsciber);
    }
    public boolean finishCall() {
        return phoneOperator.disconnect(this);
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "subscriber #" + phoneNumber;
    }
    @Override
    public boolean equals(Object obj) { // simplest
        if (obj != null && obj instanceof PhoneSubsciber) {
            return this.getPhoneNumber() == ((PhoneSubsciber) obj).getPhoneNumber();
        } else {
            return false;
        }
    }
}
