package com.jbirdvegas.mgerrit;

import com.jbirdvegas.mgerrit.objects.JSONCommit;

/**
 * Created with IntelliJ IDEA.
 * User: jbird
 * Date: 3/31/13
 * Time: 12:45 PM
 */
public class ReviewTab extends CardsActivity {
    @Override
    String getQuery() {
        return JSONCommit.KEY_STATUS_OPEN;
    }
}