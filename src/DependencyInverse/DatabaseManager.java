package DependencyInverse;

public class DatabaseManager
{
    private INotification notification;

    public DatabaseManager(INotification notification)
    {
        this.notification = notification;
    }

    public void Add()
    {
        notification.Send("Record added to database!");
    }

    public void Remove()
    {
        notification.Send("Record removed to database!");
    }

    public void Persisit()
    {
        notification.Send("Changes submitted to database!");
    }
}
