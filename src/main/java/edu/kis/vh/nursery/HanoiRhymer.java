package edu.kis.vh.nursery;

/**
 * Klasa reprezentująca wyliczankę opartą na zasadach wieży Hanoi.
 * Odrzuca liczby większe od poprzednio dodanej.
 */
public class HanoiRhymer extends defaultCountingOutRhymer {

    /**
     * Stała reprezentująca początkową liczbę odrzuconych prób.
     */
    public static final int INITIAL_REJECTED = 0;
    private int totalRejected = INITIAL_REJECTED;

    /**
     * Metoda zwracająca całkowitą liczbę odrzuconych elementów.
     * * @return liczba odrzuconych elementów (błędnych prób dodania)
     */
    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }
}