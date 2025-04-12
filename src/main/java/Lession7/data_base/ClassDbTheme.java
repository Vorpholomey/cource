package Lession7.data_base;

import java.sql.Timestamp;

public class ClassDbTheme {
    public static void main(String[] args) {
        CreatorClass firstCreator = new CreatorClass(9,
                "abukin",
                "Букин Антон Александрович",
                true,
                false,
                Timestamp.valueOf("2023-05-17 09:33:28.14093"),
                "380fa8bb-97b2-4667-bede-fd71f37d038e",
                Timestamp.valueOf("2025-01-29 07:30:00.407"));
        CreatorClass secondCreator = new CreatorClass(9,
                "abukin",
                "Букин Антон Александрович",
                true,
                false,
                Timestamp.valueOf("2023-05-17 09:33:28.14093"),
                "380fa8bb-97b2-4667-bede-fd71f37d038e",
                Timestamp.valueOf("2025-01-29 07:30:00.407"));
        DictionaryDomain firstDictionaryDomain = new DictionaryDomain(29,
                "modelDesigner",
                "internal",
                "urn:{domainCode}:{code}",
                "Дизайнер моделей",
                false,
                false,
                Timestamp.valueOf("2023-05-17 10:11:19.415229"),
                firstCreator,
                null,
                0,
                0,
                0);
        DictionaryDomain secondDictionaryDomain = new DictionaryDomain(29,
                "modelDesigner",
                "internal",
                "urn:{domainCode}:{code}",
                "Дизайнер моделей",
                false,
                false,
                Timestamp.valueOf("2023-05-17 10:11:19.415229"),
                secondCreator,
                null,
                0,
                0,
                0);
        DictionaryMetadata firstDictionaryMetadata = new DictionaryMetadata(4461,
                firstDictionaryDomain,
                "modelDesigner__patientnewtest2910final",
                "patientnewtest2910final",
                "seq__modelDesigner__patientnewtest2910final",
                null,
                null,
                null,
                "patientNeWtEST2910fINAL",
                "urn:modelDesigner:patientNeWtEST2910fINAL",
                "patientNeWtEST2910fINAL",
                null,
                null,
                Timestamp.valueOf("2023-10-29 10:11:07.528674"),
                Timestamp.valueOf("2023-10-29 10:11:07.528674"),
                firstCreator,
                false,
                false,
                true,
                PublishTypeEnum.NONE,
                false);
        DictionaryMetadata secondDictionaryMetadata = new DictionaryMetadata(4461,
                secondDictionaryDomain,
                "modelDesigner__patientnewtest2910final",
                "patientnewtest2910final",
                "seq__modelDesigner__patientnewtest2910final",
                null,
                null,
                null,
                "patientNeWtEST2910fINAL",
                "urn:modelDesigner:patientNeWtEST2910fINAL",
                "patientNeWtEST2910fINAL",
                null,
                null,
                Timestamp.valueOf("2023-10-29 10:11:07.528674"),
                Timestamp.valueOf("2023-10-29 10:11:07.528674"),
                secondCreator,
                false,
                false,
                true,
                PublishTypeEnum.NONE,
                false);
        System.out.println("Первая модель БД: \n" + firstDictionaryMetadata);
        System.out.println("Вторая модель БД: \n" + secondDictionaryMetadata);

        if (firstDictionaryMetadata.equals(secondDictionaryMetadata)) {
            System.out.println("Модели эквивалентные");
        } else {
            System.out.println("Модели различаются");
        }
    }
}
