public class GenericClass<T> {

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
}

