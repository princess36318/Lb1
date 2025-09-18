public abstract class veh {
    public void Start()
    {
        System.out.println(getClass().getSimpleName()+" is starting");
    }
    public void Stop()
    {
        System.out.println(getClass().getSimpleName()+ " is stopping");
    }
}
