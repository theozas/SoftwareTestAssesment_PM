/*
 * Paulius Miliunas Copy of example
 * this class is extension of abstract class Subscriber
 */
package ie.gmit.open;

import java.util.List;

public class PhoneSubscriber extends Subscriber{
    private int baseRate;
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }
    public int getBaseRate() {
        return baseRate;
    }
    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }
}