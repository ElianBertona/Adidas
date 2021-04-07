package api;

public enum WebServiceEndPoints {
	PETS_STORE_URL("https://petstore.swagger.iov2/pet/", "GET");
	
    private final String url;
    private final String method;

    WebServiceEndPoints(String url, String method) {
        this.url = url;
        this.method = method;
    }

    public String getUrl() {
        return url;
    }
    public String getMethod() {return method;}
}
