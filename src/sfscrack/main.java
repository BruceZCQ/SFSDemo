package sfscrack;

import java.io.FileOutputStream;
 
import com.smartfoxserver.v2.entities.data.SFSObject;
import com.smartfoxserver.v2.protocol.binary.DefaultPacketCompressor;
 
public class main {
 
        public static void main1(String[] args) throws Exception {
                SFSObject license = new SFSObject();
                license.putUtfString("customer", "");// 授权人，为空则为共享版，否则个人版
                license.putUtfString("bind", "127.0.0.1");// 限制IP
                license.putInt("users", -1);// 连接数上限，-1为无限数量
                license.putLong("expire", 0);// 版权到期时间，0为无限制
                license.putBool("private", false);// 私有？
 
                byte[] objectBytes = license.toBinary();
                objectBytes = new DefaultPacketCompressor().compress(objectBytes);
                byte[] licenseData = new byte[objectBytes.length + 4];
                for (int i = 0; i < objectBytes.length; i++) {
                        licenseData[i + 4] = (byte) (objectBytes[i] ^ licenseData[2]);
                }
 
                new FileOutputStream("license.2x").write((byte[]) licenseData);
        }
}