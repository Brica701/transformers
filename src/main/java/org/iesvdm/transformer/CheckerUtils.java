package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.Iterator;

    public class CheckerUtils {
        public static <T> void removeIfFailsCheck(Checker<T> checker, ArrayList<T> list) {
            Iterator<T> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!checker.check(iterator.next())) {
                    iterator.remove();
                }
            }
        }
    }

