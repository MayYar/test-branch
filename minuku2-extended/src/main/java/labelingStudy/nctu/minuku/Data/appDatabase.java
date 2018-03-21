package labelingStudy.nctu.minuku.Data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import labelingStudy.nctu.minuku.dao.SensorDataRecordDao;
import labelingStudy.nctu.minuku.dao.AccessibilityDataRecordDAO;
import labelingStudy.nctu.minuku.model.DataRecord.AccessibilityDataRecord;
import labelingStudy.nctu.minuku.model.DataRecord.SensorDataRecord;

/**
 * Created by chiaenchiang on 07/03/2018.
 */
@Database(entities = {SensorDataRecord.class, AccessibilityDataRecord.class},version =1)
public abstract class appDatabase extends RoomDatabase {
    public abstract SensorDataRecordDao sensorDataRecordDao();
    public abstract AccessibilityDataRecordDAO accessibilityDataRecordDao();
}
