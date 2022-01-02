package generics;

/**
 * Дженерики это составные классы, они позволяют передать в класс новый тип данных,
 * это класс указывается в <>
 *
 */

public class ResponseData<Data>  {

    private Data data;
    private Error[] errors;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Error[] getErrors() {
        return errors;
    }

    public void setErrors(Error[] errors) {
        this.errors = errors;
    }
}
