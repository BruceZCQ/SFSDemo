/**
 * 
 */
package cn.zhucongqi.httpclient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;

/**
 * @author BruceZCQ
 *
 */
public class OOHttpClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public static void main(String[] args) throws ClientProtocolException, IOException {
		HttpPost httpPost = new HttpPost("http://www.sxgjj.gov.cn/querygjj.aspx");
		 List<NameValuePair> nvps = new ArrayList<NameValuePair>();
         nvps.add(new BasicNameValuePair("btnQuery", "查询"));
		httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
		HttpClient httpclient =new DefaultHttpClient();
		HttpResponse response = httpclient.execute(httpPost);
		HttpEntity entity = response.getEntity();
		System.out.println("status : "+response.getStatusLine()+ entity);
	}
}
