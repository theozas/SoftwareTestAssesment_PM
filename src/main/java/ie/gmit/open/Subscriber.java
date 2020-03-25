/*
 * Paulius Miliunas Copy of example
 * This class is abstract and closed for modifications
 * but you can extend it by using calculateBill() method
 */
package ie.gmit.open;

public abstract class Subscriber {
    protected Long subscriberId;
    protected String address;
    protected Long phoneNumber;

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //extention
    public abstract double calculateBill();
}
