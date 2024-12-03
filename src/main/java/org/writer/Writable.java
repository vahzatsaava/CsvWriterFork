package org.writer;

import java.util.List;
/**
 * Интерфейс для записи информации в файл.
 */
public interface Writable {

    void writeToFile(List<?> data,String fileName);

}
