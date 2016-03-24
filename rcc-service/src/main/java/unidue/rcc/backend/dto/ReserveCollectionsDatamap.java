package unidue.rcc.backend.dto;

import unidue.rcc.backend.ropclient._ReserveCollectionsDatamap;

public class ReserveCollectionsDatamap extends _ReserveCollectionsDatamap {

    private static ReserveCollectionsDatamap instance;

    private ReserveCollectionsDatamap() {}

    public static ReserveCollectionsDatamap getInstance() {
        if(instance == null) {
            instance = new ReserveCollectionsDatamap();
        }

        return instance;
    }
}
