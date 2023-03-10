package review9;

public class PrivateClient {

    private String name;
    private long ssn;

    PrivateClient(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
        if (ssn != 0) {
            this.ssn = ssn;
        }
    }

    public String getName() {
        return name;
    }
    public long getSsn() {
        return ssn;
    }
}
