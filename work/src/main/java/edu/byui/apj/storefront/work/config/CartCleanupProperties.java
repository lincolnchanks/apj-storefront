package edu.byui.apj.storefront.work.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

// Anything in application.properties with the cart.cleanup prefix is referencing
// something in here. Using application.properties, we can change maxAgeMinutes
// and fixedDelayMs in this class by referencing cart.cleanup.[name-of-variable].
@ConfigurationProperties(prefix = "cart.cleanup")
public class CartCleanupProperties {
    // This class just has two attributes with getters and setters.

    private int maxAgeMinutes = 30;
    private long fixedDelayMs = 60000;

    public int getMaxAgeMinutes(){
        return maxAgeMinutes;
    }

    public void setMaxAgeMinutes(int maxAgeMinutes){
        this.maxAgeMinutes = maxAgeMinutes;
    }

    public long getFixedDelayMs(){
        return fixedDelayMs;
    }

    public void setFixedDelayMs(long fixedDelayMs){
        this.fixedDelayMs = fixedDelayMs;
    }
}
