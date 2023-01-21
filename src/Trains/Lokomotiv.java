package Trains;

public abstract class Lokomotiv {
    private String maxSpeed;
    private int wagonTraction;
    private String route;

    public Lokomotiv(String maxSpeed, int wagonTraction, String route) {
        this.maxSpeed = maxSpeed;
        this.wagonTraction = wagonTraction;
        this.route = route;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWagonTraction() {
        return wagonTraction;
    }

    public void setWagonTraction(int wagonTraction) {
        this.wagonTraction = wagonTraction;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }


}
