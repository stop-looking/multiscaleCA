package edu.sikora.ca.cells;

import java.util.Random;

/**
 * @author Kamil Sikora
 *         Data: 11.03.14
 */
public class Cell {
    private boolean mAlive;
    private Long mMarker;
    private boolean mDisabled = false;

    @Deprecated
    public Cell(boolean alive) {
        this.mAlive = alive;
        Random r = new Random(System.currentTimeMillis());
        mMarker = new Long(r.nextLong());
    }

    public Cell(boolean alive, Long pmMarker) {
        this.mAlive = alive;
        this.mMarker = pmMarker;
    }

    public boolean isAlive() {
        return mAlive;
    }

    public void setAlive(boolean alive) {
        this.mAlive = alive;
    }

    @Override
    public String toString() {
        return mAlive ? "X" : "×";
    }

    public Long getMarker() {
        return mMarker;
    }

    public void setMarker(Long pmMarker) {
        mMarker = pmMarker;
    }

    public boolean isDisabled() {
        return mDisabled;
    }

    public void setDisabled(boolean pmDisabled) {
        mDisabled = pmDisabled;
    }
}