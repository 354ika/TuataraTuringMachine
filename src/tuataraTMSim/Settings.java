package tuataraTMSim;

import javax.swing.*;

/**
 * Holds values and functions for user configurable settings.
 */
public final class Settings {

    // Should never instantiate.
    private Settings() {}

    /**
     * Dictates snapping behaviour for states and transition lines.
     */
    private static boolean m_snapToGrid = false;

    /**
     * Set grid snapping behaviour.
     * @param value The new behaviour.
     */
    public static void setSnapToGrid(boolean value) {
        m_snapToGrid = value;
    }

    /**
     * Get the current grid snapping behaviour.
     * @return The current grid snapping behaviour.
     */
    public static boolean getSnapToGrid() {
        return m_snapToGrid;
    }



    /**
     * The size of the grid to snap to.
     */
    private static int m_gridSize = 10;

    /**
     * Set the grid size for snapping if enabled.
     * @param size The new grid size.
     * @implNote If given size is < 1, it is set to 1.
     */
    public static void setGridSize(int size)
    {
        m_gridSize = Math.max(1, size);
    }

    /**
     * Get the current grid size for snapping if enabled.
     * @return The current grid size.
     */
    public static int getGridSize() {
        return m_gridSize;
    }

    /**
     * Snap a given value to the grid.
     * @param value The value to snap.
     * @return The snapped value.
     */
    public static int snapValueToGrid(int value) {
        return (int)Math.round((double)value / m_gridSize) * m_gridSize;
    }
}
