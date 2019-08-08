package shubham.sharma.ri12;


public class Load {
    private String name;
    private String phone;
    private String product;

    public Load() {}
    public Load(String name, String phone, String product, String trafficid, String vechileno) {
        this.name = name;
        this.phone = phone;
        this.product = product;
        this.trafficid = trafficid;
        this.vechileno = vechileno;
    }

    private String trafficid;
    private String vechileno;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getTrafficid() {
        return trafficid;
    }

    public void setTrafficid(String trafficid) {
        this.trafficid = trafficid;
    }

    public String getVechileno() {
        return vechileno;
    }

    public void setVechileno(String vechileno) {
        this.vechileno = vechileno;
    }


}
