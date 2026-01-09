# Garden Of Grind - Challenge World Generation

A Minecraft 1.7.10 Forge mod that adds a custom world type called "Garden Of Grind" for GTNH (GregTech: New Horizons).

This mod uses the GTNH mod structure and build system.

## Features

- **Empty World Generation**: Generates worlds with absolutely no blocks and no structures
- **Biome Support**: Integrates with RWG (Realistic World Gen) biomes if available, falls back to vanilla biomes
- **Challenge Mode**: Perfect for skyblock-style challenges or custom gameplay
- **GTNH Compatible**: Built using GTNH conventions and RetroFuturaGradle

## Installation

1. Download the mod JAR file from releases
2. Place it in your Minecraft 1.7.10 `mods` folder
3. Launch Minecraft with Forge installed

## Usage

1. Create a new world
2. Select "Garden Of Grind" as the world type
3. Generate your world - it will contain only biomes, no blocks or structures

## Building

This mod uses the GTNH build system with RetroFuturaGradle.

### Setup Development Workspace

```bash
./gradlew setupDecompWorkspace
```

### Build the Mod

```bash
./gradlew build
```

The compiled JAR will be in `build/libs/`

### Run in Development

```bash
# Run client
./gradlew runClient

# Run server
./gradlew runServer
```

## Compatibility

- **Minecraft Version**: 1.7.10
- **Forge Version**: 10.13.4.1614 or later
- **Build System**: RetroFuturaGradle (GTNH)
- **Optional**: RWG (Realistic World Gen) for enhanced biome generation

## Technical Details

The mod consists of the following components:

- `GardenOfGrind`: Main mod class with event handlers
- `CommonProxy`/`ClientProxy`: Side-specific initialization logic
- `WorldTypeGardenOfGrind`: Registers the custom world type with RWG integration
- `ChunkProviderGardenOfGrind`: Generates empty chunks with biome data only

## Development

This project follows GTNH modding conventions:
- Uses Kotlin-based Gradle build scripts
- Implements the proxy pattern for client/server separation
- Utilizes GTNH's RetroFuturaGradle for modern Java syntax support
- Follows GTNH code style and structure guidelines

## License

This mod is designed specifically for use with GTNH (GregTech: New Horizons).
