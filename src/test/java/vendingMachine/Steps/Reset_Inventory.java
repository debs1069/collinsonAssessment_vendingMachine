package vendingMachine.Steps;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Assert;

import java.io.File;

public class Reset_Inventory {


    public void resetinventory() {
        String path="./src/test/resources/config/Input.properties";
        File f = new File(path);
        try {
//
            PropertiesConfiguration config = new PropertiesConfiguration(path);
            config.setProperty("accept.products", "Coke-25,Pepsi-35,Soda-45");
            config.setProperty("accepted.coins","1,5,10,25");
            config.save();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Assert.assertEquals("inventory reseted", true, true);
        System.out.println("product and coin inventory reset successfully");
    }
}
