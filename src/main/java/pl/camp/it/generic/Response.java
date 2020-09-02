package pl.camp.it.generic;

public class Response<TYP> {
    private int status;
    private String message;
    private TYP object;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TYP getObject() {
        return object;
    }

    public void setObject(TYP object) {
        this.object = object;
    }
}
