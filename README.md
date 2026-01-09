# Garden Of Grind - Challenge World Generation

A Minecraft 1.7.10 Forge mod that adds a custom world type called "Garden Of Grind" for GTNH (GregTech: New Horizons).

## Features

- **Empty World Generation**: Generates worlds with absolutely no blocks and no structures
- **Biome Support**: Integrates with RWG (Realistic World Gen) biomes if available, falls back to vanilla biomes
- **Challenge Mode**: Perfect for skyblock-style challenges or custom gameplay

## Installation

1. Download the mod JAR file
2. Place it in your Minecraft 1.7.10 `mods` folder
3. Launch Minecraft with Forge installed

## Usage

1. Create a new world
2. Select "Garden Of Grind" as the world type
3. Generate your world - it will contain only biomes, no blocks or structures

## Building

This mod requires ForgeGradle 1.2 and Minecraft Forge 1.7.10.

```bash
./gradlew build
```

## Compatibility

- **Minecraft Version**: 1.7.10
- **Forge Version**: 10.13.4.1614 or later
- **Optional**: RWG (Realistic World Gen) for enhanced biome generation

## Technical Details

The mod consists of three main components:

- `WorldTypeGardenOfGrind`: Registers the custom world type
- `ChunkProviderGardenOfGrind`: Generates empty chunks with biome data only
- `GardenOfGrind`: Main mod class that initializes the world type

## License

This mod is designed specifically for use with GTNH (GregTech: New Horizons).
