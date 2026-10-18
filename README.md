
# RPG Battle System — Facade Pattern

## Description
This project demonstrates the Facade Design Pattern in Java using a simple RPG battle system.

The Facade Pattern provides a simple interface to a complex subsystem.

In this project, BattleFacade coordinates different systems to perform a battle.

## Design Pattern
- Pattern: Facade
- Type: Structural Design Pattern
- Language: Java

## Project Structure

```text
RPGFacadePattern/
└── src/
    ├── Main.java
    ├── BattleFacade.java
    ├── CharacterSystem.java
    ├── SkillSystem.java
    ├── ElementSystem.java
    ├── DamageSystem.java
    └── RewardSystem.java
```

## Classes

- **Main** — Client that uses the Facade.
- **BattleFacade** — Coordinates the battle process.
- **CharacterSystem** — Checks character health.
- **SkillSystem** — Manages skill energy.
- **ElementSystem** — Calculates elemental bonus damage.
- **DamageSystem** — Calculates and applies damage.
- **RewardSystem** — Calculates rewards after victory.

## How It Works

1. Main calls the BattleFacade.
2. CharacterSystem checks player health.
3. SkillSystem checks and consumes energy.
4. ElementSystem calculates bonus damage.
5. DamageSystem calculates and applies damage.
6. RewardSystem calculates the reward.

The client communicates only with BattleFacade.

## Code Example

```java
public class Main {
    public static void main(String[] args) {
        BattleFacade battle = new BattleFacade();
        battle.startBattle("Traveler", "Slime");
    }
}
```

## Output

```text
Traveler fights Slime
Damage dealt: 55
Enemy health: 0
Remaining energy: 10
Reward: 100 gold
```

## Clean Code Principles

1. **Meaningful Names** — Classes and methods have clear names.
2. **Single Responsibility Principle** — Each class has one responsibility.
3. **Encapsulation** — Subsystem objects are private in BattleFacade.
4. **DRY Principle** — Battle coordination logic is not repeated in the client.
5. **Separation of Concerns** — Each subsystem handles a different part of the battle.

## Advantages

- Simplifies client code.
- Reduces dependencies.
- Improves readability.
- Makes maintenance easier.
- Hides complex subsystem interactions.

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Open `Main.java`.
4. Run the program.
5. View the results in the console.

## Conclusion

The Facade Pattern simplifies complex interactions between multiple subsystems.

In this project, BattleFacade provides one simple interface to manage the RPG battle process.

## Assignment Information

- **Course:** Software Design Patterns
- **Assignment:** #4
- **Pattern:** Facade
- **Language:** Java
