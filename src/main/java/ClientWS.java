import com.sun.xml.ws.client.Stub;
import org.glassfish.jaxb.runtime.v2.runtime.output.StAXExStreamWriterOutput;
import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.covert(7600));
        Compte cp = stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());

    }
}
