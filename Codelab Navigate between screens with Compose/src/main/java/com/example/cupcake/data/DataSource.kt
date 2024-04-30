/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.cupcake.data

import com.example.cupcake.R

object DataSource {
    val flower_types = listOf(
        R.string.rose,
        R.string.daisy,
        R.string.iris,
        R.string.lilies,
        R.string.sunflower
    )
    // email is used to send the order confirmation
    var userEmail: String = "Test@test.com"

    val quantityOptions = listOf(
        Pair(R.string.one_bouquet_flowers, 1),
        Pair(R.string.six_bouquet_flowers, 6),
        Pair(R.string.twelve_bouquet_flowers, 12)
    )
}
