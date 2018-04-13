package com.spacexdata.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Repo {

    @SerializedName("flight_number")
    @Expose
    public Integer flightNumber;
    @SerializedName("launch_year")
    @Expose
    public String launchYear;
    @SerializedName("launch_date_unix")
    @Expose
    public Integer launchDateUnix;
    @SerializedName("launch_date_utc")
    @Expose
    public String launchDateUtc;
    @SerializedName("launch_date_local")
    @Expose
    public String launchDateLocal;
    @SerializedName("rocket")
    @Expose
    public Rocket rocket;
    @SerializedName("telemetry")
    @Expose
    public Telemetry telemetry;
    @SerializedName("reuse")
    @Expose
    public Reuse reuse;
    @SerializedName("launch_site")
    @Expose
    public LaunchSite launchSite;
    @SerializedName("launch_success")
    @Expose
    public Boolean launchSuccess;
    @SerializedName("links")
    @Expose
    public Links links;
    @SerializedName("details")
    @Expose
    public String details;

}
