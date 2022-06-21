package containers;

import agents.AcheteurAgent;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;
import jade.wrapper.StaleProxyException;

public class AcheteurContainer {

    public AcheteurContainer (){
        Runtime runtime = Runtime.instance();
        ProfileImpl profileImpl = new ProfileImpl(false);
        profileImpl.setParameter(Profile.MAIN_HOST,"localhost");
        profileImpl.setParameter(Profile.CONTAINER_NAME,"Acheteurs");

        AgentContainer agentContainer = runtime.createAgentContainer(profileImpl);
        try {
            AgentController agentController = agentContainer.createNewAgent("Acheteur 1 ", AcheteurAgent.class.getName(),new Object[] {});
            agentController.start();
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
    }
    }
