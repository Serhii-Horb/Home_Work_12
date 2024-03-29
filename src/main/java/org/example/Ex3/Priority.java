package org.example.Ex3;

public enum Priority {
    NORMAL(1), // обычный приоритет
    MEDIUM(2), // средний приоритет
    HIGH(3), // высокий приоритет
    HIGHEST(4); // самый высокий приоритет
    int indexPriority;

    Priority(int indexPriority) {
        this.indexPriority = indexPriority;
    }

    public int getIndexPriority() {
        return indexPriority;
    }
}
