package PCAP_GUI.TableInfo;

/**
 * Created by renzo on 2017-03-30.
 */
public class UsageTable {

    private String IPaddressProperty;
    private Integer packetProperty;

    public UsageTable(String IPaddress, Integer packet){
        this.IPaddressProperty = IPaddress;
        this.packetProperty = packet;
    }

    public String getIPaddressProperty() {
        return IPaddressProperty;
    }

    public Integer getPacketProperty() {
        return packetProperty;
    }
}
