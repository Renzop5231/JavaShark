package PCAP_GUI.TableInfo;

/**
 * Created by renzo on 2017-04-07.
 */
public class TimeTable {
    private String IPaddressProperty;
    private String firstArrivalProperty;
    private String lastArrivalProperty;


    public TimeTable(String IPaddress, String firstArr, String lastArr) {
        this.IPaddressProperty = IPaddress;
        this.firstArrivalProperty = firstArr;
        this.lastArrivalProperty = lastArr;

    }

    public String getIPaddressProperty() {
        return IPaddressProperty;
    }

    public String getFirstArrivalProperty() {
        return firstArrivalProperty;
    }

    public String getLastArrivalProperty() {
        return lastArrivalProperty;
    }
}
