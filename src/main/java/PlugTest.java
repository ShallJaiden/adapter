public class PlugTest {
    public static void main(String[] args) {
        G_Outlet britishOutlet = new BritishOutlet();
        USAPlug usaPlug = new USAPlug();
        A_Adapter adapter = new A_Adapter(usaPlug);
        britishOutlet.plugged(adapter);
    }
}
