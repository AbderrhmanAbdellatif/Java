package şikayettakiptest;

public class Elestiri implements IGeriBildirim {

    @Override
    public void geriBildirimdeBulun(IGeriBildirim geriBildirim) {
        SikayetTakipTest.db.add((Elestiri) geriBildirim);
    }
}
