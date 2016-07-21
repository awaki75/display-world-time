Display World Time
==================

画面左上にワールドの時刻を表示するmod

## Requirement

- Minecraft 1.7.10
- MinecraftForge 1.7.10 - 10.13.4.1614

## Development

```
./gradlew setupDecompWorkspace eclipse
```

Eclipseで `eclipse/` をワークスペースとして選択する

## Release

```
./gradlew build
```

`build/libs/` にJarファイルが生成されるので，それを `mods/` に入れる
