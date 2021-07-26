public class BritishOutlet implements G_Outlet{
    @Override
    public void plugged(G_Plug plug) {
        System.out.println("connected");
    }
}
