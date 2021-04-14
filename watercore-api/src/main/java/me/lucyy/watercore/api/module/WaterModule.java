/*
 * Copyright © 2021 Lucy Poulton.
 * This file is part of watercore.
 *
 * watercore is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * watercore is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with watercore.  If not, see <https://www.gnu.org/licenses/>.
 */

package me.lucyy.watercore.api.module;

import me.lucyy.common.command.Subcommand;
import java.util.Set;
import me.lucyy.watercore.api.version.SemanticVersion;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;

/**
 * A module.
 */
public abstract class WaterModule implements Listener {

	/**
	 * Gets the name of this module.
	 */
	@NotNull
	public abstract String getName();

	/**
	 * Gets the version of this module. The major and minor version should match the core that this plugin is built
	 * against.
	 */
	@NotNull
	public abstract SemanticVersion getVersion();

	/**
	 * Gets a set of commands that this plugin exposes. These commands will be exposed as root commands.
	 */
	@NotNull
	public abstract Set<Subcommand> getCommands();

	/**
	 * Called when this module is enabled.
	 */
	public void onEnable() {
	}

	/**
	 * Called when this module is disabled.
	 */
	public void onDisable() {
	}
}
