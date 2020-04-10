import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GenericClassMain {
    //creating object of a class Logger
    private static Logger logger = LogManager.getLogger(GenericClassMain.class.getName());


    public static void main(String[] args) {

        //displaying
        logger.info("********Student Information***********");

        GenericClass<String> studName = new GenericClass<>();//instance of String type
        studName.set("Manqasana Lepota");//set student name
        logger.debug("Student Name : " + studName.get());//print student name


        GenericClass<Integer> studNumber = new GenericClass<>();//instance of type Integer
        studNumber.set(20200410);//set student number
        logger.debug("Student Number : " + studNumber.get());//print student number
    }
}
