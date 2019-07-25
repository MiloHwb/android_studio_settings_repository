package ${PACKAGE_NAME};

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

#parse("File Header.java")

/*
 * @ 创建者       ${USER}
 * @ 创建时间     ${DATE} ${TIME}
 * @ 描述         
 */
public class ${NAME} extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
