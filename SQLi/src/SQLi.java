/**
 * Created by colind on 13/05/14.
 */

import org.owasp.esapi.*;
import org.owasp.esapi.codecs.Codec;
import org.owasp.esapi.codecs.MySQLCodec;

public class SQLi {

    public static void main(String[] args) {

        System.out.print("SQLi application starting ...");

        Codec codec = new MySQLCodec(MySQLCodec.Mode.STANDARD);

        ESAPI.encoder().encodeForSQL(codec, "");

    }
}
