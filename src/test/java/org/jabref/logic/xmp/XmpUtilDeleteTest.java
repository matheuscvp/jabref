package org.jabref.logic.xmp;

import org.junit.jupiter.api.Test;
import org.jabref.logic.xmp.XmpUtilDelete;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class XmpUtilDeleteTest {

    @Test
    void testIfIsPdf() {
        String path = "exemplo.pdf";
        boolean result = XmpUtilDelete.isPdf(path);
        assertEquals(true, result);
    }

    @Test
    void testDeleteFieldMetadata() {
        XmpUtilDelete newObj = new XmpUtilDelete("Title", "Author", "Subject", "Today Time");
        String result = newObj.DeleteField(1);
        assertEquals(null, result);
    }
}
