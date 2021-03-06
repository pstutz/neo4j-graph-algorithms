/**
 * Copyright (c) 2017 "Neo4j, Inc." <http://neo4j.com>
 *
 * This file is part of Neo4j Graph Algorithms <http://github.com/neo4j-contrib/neo4j-graph-algorithms>.
 *
 * Neo4j Graph Algorithms is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.graphalgo.core.huge.loader;

import org.neo4j.graphalgo.api.HugeWeightMapping;

/**
 * WeightMapping implementation which always returns
 * a given default weight upon invocation
 *
 * @author mknblch
 */
class HugeNullWeightMap implements HugeWeightMapping {

    private final double defaultValue;

    HugeNullWeightMap(double defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public double weight(final long source, final long target) {
        return defaultValue;
    }

    @Override
    public double weight(final long source, final long target, final double defaultValue) {
        return defaultValue;
    }

    @Override
    public double nodeWeight(final long nodeId) {
        return defaultValue;
    }

    @Override
    public double nodeWeight(final long nodeId, final double defaultValue) {
        return defaultValue;
    }

    @Override
    public double get(final long id) {
        return defaultValue;
    }

    @Override
    public double get(final long id, final double defaultValue) {
        return defaultValue;
    }

    @Override
    public double get(final int source, final int target) {
        return defaultValue;
    }

    @Override
    public double get(final int id) {
        return defaultValue;
    }

    @Override
    public double get(final int id, final double defaultValue) {
        return defaultValue;
    }

    @Override
    public long release() {
        return 0L;
    }
}
