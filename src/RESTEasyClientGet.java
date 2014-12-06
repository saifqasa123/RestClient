import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;


public class RESTEasyClientGet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			 Product p = new Product();
			 p.setName("dsaf");
			ClientRequest request = new ClientRequest("http://localhost:8443/RestExample/rest/hello/Hi");
			request.accept("application/json");
			ClientResponse<String> response = request.get(String.class);
	 
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
					+ ((Response) response).getStatus());
			}
	 
			BufferedReader br = new BufferedReader(new InputStreamReader(
				new ByteArrayInputStream(response.getEntity().getBytes())));
	 
			StringBuilder build = new StringBuilder();
			String str ;
			while ((str= br.readLine()) != null) {
				build.append(str);
			}
			System.out.println(build.toString());
		  
		  } catch (IOException e) {
	 
			e.printStackTrace();
	 
		  } catch (Exception e) {
	 
			e.printStackTrace();
	 
		  }

	}

}
