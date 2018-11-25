package interop;

import classes.CustomerKotlin;
import classes.CustomerKotlinKt;
import classes.Status;

import java.io.IOException;

public class TalkingToKotlin {

    public void loadStats(CustomerKotlin customerKotlin) {
        try {
            customerKotlin.loadStatistics("filename");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Nate","mail@natron.com");

        customerKotlin.setEmail("mail@nate.com");
        String value = customerKotlin.someField;

        customerKotlin.changeStatus(Status.Current);

        // this one was made possible by @JvmOverloadds
        customerKotlin.changeStatus();

        /* This one was made possible by @JvmName.  This annotation helps with type differentiation in certain
         * overloading situations that can pop up when using generics in Java.
         */
        customerKotlin.preferential();

        CustomerKotlinKt.extension(customerKotlin);

        System.out.println(UtilityClass.prefix("some", "value"));
        System.out.println(UtilityClass.getCopyrightYear());
        System.out.println(UtilityClass.CopyrightYear2);
    }
}
