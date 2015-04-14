package com.rhmswd.Workflow;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import com.rhmswd.service.user.ReceiveHeartRate;


@Path("/receiveHB")
public class ReceiveHeartRateWF {
	@GET
	  public String receiveHB( ) {
	    return "Hello Jerseyskfsd";
	  }
	  
	  @POST
	  public String receiveHBdata(String parameters)
	  {
		  
		  
		  //  validate the request
		  
		 // validateDataParameter(parameters);
		  
		  ReceiveHeartRate rhr = new ReceiveHeartRate();
		  
		  // call service method to set bean 
		  rhr.processHeartRate(parameters);
		  
		  
		  

		 // get connection to database
		  
		  // validate user
		  
		  // append data 
		  
		  return parameters;
	  }
	  
	  
	  private static boolean validateDataParameter(String parameters)
	  {
		  
		  try {
			JSONObject obj_json =  new JSONObject(parameters);
			if(obj_json.getJSONObject("data").getJSONObject("timestamp").getString("heart_rate").isEmpty())
			{
				System.out.println("no heart rate");
				// Ignore message
				// no further processing
				return false;
			}
			
			// validation for the threshhold value
			
			if(Integer.parseInt(obj_json.getJSONObject("data").getJSONObject("timestamp").getString("heart_rate")) < 30)
			{
				System.out.println("Critical heart rate....below 30");
				// Send notification low heart rate
				
				return true;

			}
			
			if(Integer.parseInt(obj_json.getJSONObject("data").getJSONObject("timestamp").getString("heart_rate")) > 130)
			{
				System.out.println("Critical heart rate....above 130");
				// Send notification low heart rate
				
				return true;

			}
			
			else
			{
				System.out.println("valid parameters");
				return true;
			}
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		  
		  
	  }
	  

}
