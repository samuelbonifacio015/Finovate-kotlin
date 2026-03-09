# AGENTS.MD - FINOVATE KOTLIN

## Build, Lint & Test Commands

### Gradle Wrapper
```bash
# Run from project root: /home/samuel/codigoooo/Finovate-kotlin

# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Clean build
./gradlew all checks (lint clean

# Run + tests)
./gradlew check
```

### Running Tests
```bash
# Run all unit tests
./gradlew test

# Run unit tests for debug variant
./gradlew testDebugUnitTest

# Run a single test class
./gradlew testDebugUnitTest --tests "com.finovate.kotlin.ExampleUnitTest"

# Run a single test method
./gradlew testDebugUnitTest --tests "com.finovate.kotlin.ExampleUnitTest.testMethodName"

# Run all instrumented tests (requires emulator/device)
./gradlew connectedAndroidTest

# Run a single instrumented test
./gradlew connectedAndroidTest --tests "com.finovate.kotlin.ExampleInstrumentedTest.testMethodName"
```

### Lint
```bash
# Run lint analysis
./gradlew lint

# Run lint for debug variant only
./gradlew lintDebug
```

---

## Code Style Guidelines

### Naming Conventions
- **Classes/Interfaces**: `PascalCase` - `UserRepository`, `TransactionAdapter`
- **Functions**: `camelCase` - `getUser()`, `fetchTransactions()`
- **Properties/Variables**: `camelCase` - `userName`, `isLoading`
- **Constants**: `UPPER_SNAKE_CASE` - `MAX_RETRY_COUNT`, `API_BASE_URL`
- **Packages**: lowercase - `com.finovate.kotlin.data.model`
- **Layout XML**: `snake_case` - `activity_main.xml`, `item_transaction.xml`

### Kotlin-Specific Rules
- **Prefer `val` over `var`**: Use immutable variables by default
- **Nullable types**: Use `?` sparingly and handle null safely with `?.`, `?:`, or `?.let {}`
- **Data classes**: Use for DTOs and models that primarily hold data
- **Sealed classes**: Prefer for restricted hierarchies (states, results)
- **Coroutines**: Use `viewModelScope` in ViewModels, `lifecycleScope` in Activities/Fragments

### Architecture
- **Package structure**: Feature-based or layer-based (`data/model`, `ui/home`, `viewmodel`)
- **MVVM**: Keep business logic in ViewModels, UI logic in Activities/Fragments
- **Repository pattern**: Single source of truth for data operations
- **Dependency injection**: Use constructor injection where possible

### Error Handling
- **Try-catch**: Catch specific exceptions, not generic `Exception`
- **Result wrapper**: Use sealed classes for operation results (Success/Error)
- **Coroutines**: Use `try-catch` inside suspend functions or `catch` operator
- **Never suppress exceptions silently**: Log or handle appropriately

### Imports
- Standard library imports first
- Android imports
- Third-party imports
- Project imports
- Group by package with blank line separation

### Formatting
- Max line length: 120 characters (or 100 for Android-specific guidelines)
- Use 4 spaces for indentation (not tabs)
- Blank lines: One between top-level declarations, one between function groups
- No trailing whitespace

---

## Learning Commands (For Beginner Developer)

### /init - Initialize Project
Creates project structure with educational comments for Kotlin beginners.

### /next - Next Task
Presents the next task in the learning roadmap with detailed explanations.

### /explain [concept] - Explain Concept
Explains Kotlin concepts with:
- Simple definition
- Real-world analogy
- Code examples
- Flutter comparison (if relevant)

### /fix - Debug Help
Helps solve errors by:
1. Explaining the error in Spanish
2. Identifying the cause
3. Providing step-by-step solution
4. Preventing future occurrences

### /review - Code Review
Reviews code for:
- Bugs and errors
- Best practices
- Refactoring opportunities

### /compare [flutter_concept] - Flutter Comparison
Shows equivalence between Flutter/Dart and Kotlin/Android concepts.

---

## Project Structure

```
app/src/main/java/com/finovate/kotlin/
├── MainActivity.kt
├── data/
│   ├── model/          # Data classes, entities
│   ├── repository/      # Data access abstraction
│   └── local/          # Room database
├── network/
│   ├── api/            # Retrofit services
│   └── dto/            # Data transfer objects
├── ui/
│   ├── home/
│   ├── login/
│   ├── transactions/
│   └── profile/
├── viewmodel/          # ViewModels (MVVM)
├── adapters/           # RecyclerView adapters
└── utils/              # Utilities
```

---

## Current Project Status

- **Language**: Kotlin 1.9.22
- **Min SDK**: 24 (Android 7.0)
- **Target SDK**: 36
- **Architecture**: MVVM with ViewBinding
- **Key Dependencies**: AndroidX, Navigation, Room, Retrofit, Coroutines, Coil

---

## Notes for Agents

1. This is a learning project for a Kotlin beginner - include educational comments
2. Compare with Flutter/Dart when explaining concepts
3. Always verify code compiles before presenting to user
4. Use Spanish for explanations, technical terms in English
5. Run `./gradlew assembleDebug` after major changes to verify build
