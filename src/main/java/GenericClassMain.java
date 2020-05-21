
public class GenericClassMain<T> {

    //A variable of type T is declared
    private T studInfo;

    //set method
    public void set(T studInfo) {
        this.studInfo = studInfo;
    }

    //get method
    public T get() {
        return studInfo;
    }

    public static <T> void printArrayContent(T[] studInfo ) {
        //Display array elements
        for(T type : studInfo) {
            System.out.printf("%s ", type);
        }
        System.out.println();
    }


    public static void main(String[] args) {

        //Create arrays of Integer and String
        Integer[] intArrayStudNumbers = { 2001, 2002, 2003, 2004, 2005 };
        String[] stringArrayStuNames = { "Lwandle", "Lerato", "Nqobile", "Kwanele" };

        System.out.println("\nArray intArrayStudNumbers contains:");
        printArrayContent(intArrayStudNumbers);// pass an Integer array


        System.out.println("\nArray stringArrayStuNames contains:");
        printArrayContent(stringArrayStuNames);// pass an String array



        GenericClassMain<String> studName = new GenericClassMain<>();//instance of String type
        studName.set("Manqasana Lepota");//set student name
        System.out.println("\nStudent Name : " + studName.get());//print student name


        GenericClassMain<Integer> studNumber = new GenericClassMain<>();//instance of type Integer
        studNumber.set(2006);//set student number
        System.out.println("Student Number : " + studNumber.get());//print student number
    }
}
