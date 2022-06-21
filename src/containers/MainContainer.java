package containers;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.util.ExtendedProperties;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;
import jade.wrapper.ControllerException;

public class MainContainer {
    public static void main(String[] args) {
        Runtime runtime = Runtime.instance();
        Properties properties = new ExtendedProperties();
        properties.setProperty(Profile.GUI,"true");
        properties.setProperty(Profile.CONTAINER_NAME,"SMA_IFRI Begin");

        ProfileImpl profileImpl =  new ProfileImpl(properties);

        // Création du main container
        AgentContainer mainContainer = runtime.createMainContainer(profileImpl) ;
        try {
            mainContainer.start();
        } catch (ControllerException e) {
            e.printStackTrace();
        }
    }
}
