
interface INetworkProtocol {
    void broadcastMessage(String msg);
}


class BluetoothMeshNetwork implements INetworkProtocol {

    @Override
    public void broadcastMessage(String msg) {
        System.out.println("Broadcasting via Bluetooth Mesh: " + msg);
    }
}


class WiFiDirectNetwork implements INetworkProtocol {

    @Override
    public void broadcastMessage(String msg) {
        System.out.println("Broadcasting via WiFi Direct: " + msg);
    }
}


class DisasterAlertSystem {

    private INetworkProtocol network;

    public DisasterAlertSystem(INetworkProtocol network) {
        this.network = network;
    }

    public void triggerAlert(String alertData) {
        network.broadcastMessage(alertData);
    }
}

public class Main {

     public static void main(String[] args) {
        INetworkProtocol bluetooth = new BluetoothMeshNetwork();
        DisasterAlertSystem system1 = new DisasterAlertSystem(bluetooth);
        system1.triggerAlert("Earthquake detected!");

        INetworkProtocol wifi = new WiFiDirectNetwork();
        DisasterAlertSystem system2 = new DisasterAlertSystem(wifi);
        system2.triggerAlert("Flood warning");
     }
}
