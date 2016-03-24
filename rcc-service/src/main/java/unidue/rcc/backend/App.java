package unidue.rcc.backend;

import org.apache.cayenne.CayenneContext;
import org.apache.cayenne.DataChannel;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.event.DefaultEventManager;
import org.apache.cayenne.remote.ClientChannel;
import org.apache.cayenne.remote.ClientConnection;
import org.apache.cayenne.remote.hessian.HessianConnection;

import unidue.rcc.backend.dto.Department;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        ClientConnection connection = new HessianConnection("http://localhost:8080/library-uni-due-model/cayenne-service");
        DataChannel channel = new ClientChannel(connection, false, new DefaultEventManager(), false);
        ObjectContext context = new CayenneContext(channel);
        
        Department department = context.newObject(Department.class);
        
        department.setLang("DE");
        department.setText("Fakultät / Institut");
        
        context.commitChanges();
        
        System.out.println( "Hello World!" );
    }
}
