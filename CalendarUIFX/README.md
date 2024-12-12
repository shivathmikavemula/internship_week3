
# CalendarUIFX

A simple JavaFX project that displays a calendar-like grid with a sidebar. This project uses JavaFX and CSS for styling.

## Folder Structure

```
CalendarUIFX/
│
├── src/
│   └── CalendarUIFX.java
│
├── resources/
│   └── styles.css
│
├── README.md
└── build/
    └── (Generated files after compilation)
```

## Prerequisites

- Java 11 or higher
- JavaFX SDK (configured in your IDE or terminal)

## How to Run

1. Navigate to the `src` folder:
   ```bash
   cd CalendarUIFX/src
   ```
2. Compile the project:
   ```bash
   javac -d ../build CalendarUIFX.java
   ```
3. Run the project:
   ```bash
   java -cp ../build CalendarUIFX
   ```

## Features

- Sidebar navigation
- Calendar grid with buttons for dates 1-30
- Styled using CSS for a modern look
